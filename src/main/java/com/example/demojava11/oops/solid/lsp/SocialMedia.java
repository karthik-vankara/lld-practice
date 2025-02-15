package com.example.demojava11.oops.solid.lsp;

abstract class SocialMedia {
    abstract void chatWithFriends();
    abstract void publishPost(Object post);
    abstract void sendPhotosAndVideos();
    abstract void groupVideoCall(String... users);
}
