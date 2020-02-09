package com.smarttoolfactory.data.source.remote

import com.smarttoolfactory.data.api.GithubApi
import com.smarttoolfactory.data.model.local.FavoriteRepoEntity
import com.smarttoolfactory.data.model.local.RepoEntity
import com.smarttoolfactory.data.model.remote.response.RepoDTO
import com.smarttoolfactory.data.source.GithubDataSource
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class RemoteGithubDataSource @Inject constructor(private val webService: GithubApi) :
    GithubDataSource {

    override fun getRepoDTOs(user: String): Single<List<RepoDTO>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRepoEntities(): Single<List<RepoEntity>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteRepos(): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setFavoriteStatus(favoriteRepoEntity: FavoriteRepoEntity): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFavoriteReposByUser(user: String): Single<List<FavoriteRepoEntity>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFavoriteRepos(): Single<List<FavoriteRepoEntity>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}