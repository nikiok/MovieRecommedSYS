import request from "@/utils/request";

const prefix = "http://localhost:8888";
const personalRequest = {


    addComment: (comment) => {
        return request({
            url: prefix + '/comment',
            method: 'post',
            headers: {
                isNeedToken: true,
            },
            data: comment
        })
    },
    getOwnComment: (mid) => {
        return request({
            url: prefix + '/comment/own',
            method: 'get',
            headers: {
                isNeedToken: true,
            },
            params: {
                mid: mid
            }
        })
    },
    getCommentsByMovieId: (mid) => {
        return request({
            url: prefix + '/comment/all',
            method: 'get',
            headers: {
                isNeedToken: true,
            },
            params: {
                mid: mid
            }
        })
    }
}

export default personalRequest
