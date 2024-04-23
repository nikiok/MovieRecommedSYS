import request from "@/utils/request";

const prefix = "http://localhost:8888";
const authRequest = {
    /**
     * 请求验证码
     * @param mail 接收验证码的邮箱
     * @returns {*}
     */
    getAuthCode: (mail) => {
        return request({
            url: prefix + '/mail/auth/code',
            method: 'post',
            headers: {
                isNeedToken: true
            },
            data: {
                mail,
            }
        })
    },
    /**
     * 在未登录的状态下请求验证码
     * @param username 用户名
     * @param mail 接收邮箱
     * @returns {*}
     */
    getAuthCodeUnderLogout: (username, mail) => {
        return request({
            url: prefix + '/mail/auth/code/under/logout',
            method: 'post',
            headers: {
                isNeedToken: false
            },
            data: {
                username,
                mail
            }
        })
    },
    /**
     * 校验验证码
     * @param username 用户名
     * @param authCode 待校验的验证码
     * @returns {*}
     */
    checkAuthCode: (username, authCode) => {
        return request({
            url: prefix + '/check/auth/code',
            method: 'post',
            headers: {
                isNeedToken: false
            },
            data: {
                username,
                authCode
            }
        })
    },
    /**
     * 判断用户名是否存在于数据库中
     * @param username
     * @returns {*}
     */
    checkUsernameExists: (username) => {
        return request({
            url: prefix + '/check/username/exists',
            method: 'get',
            headers: {
                isNeedToken: false
            },
            params: {
                username
            }
        })
    },
    /**
     * 判断用户名是否存在于数据库中
     * @param username 用户名
     * @param authCode 验证码
     * @returns {*}
     */
    judgeAndFindPassword: (username, authCode) => {
        return request({
            url: prefix + '/find/password',
            method: 'post',
            headers: {
                isNeedToken: false
            },
            data: {
                username,
                authCode
            }
        })
    },
    /**
     * 在验证码校验成功情况下，更新用户邮箱信息
     * @param authCode 用户输入的校验码
     * @param mail 邮箱号码
     * @returns {*}
     */
    updateMail: (authCode, mail) => {
        return request({
            url: prefix + '/user/update/mail',
            method: 'put',
            headers: {
                isNeedToken: true,
            },
            data: {
                authCode,
                mail
            }
        })
    },
}

export default authRequest;