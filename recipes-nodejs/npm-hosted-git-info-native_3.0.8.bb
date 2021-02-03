SUMMARY = "NPM: hosted-git-info"
DESCRIPTION = "Provides metadata and conversions from repository urls for Github, Bitbucket and Gitlab"
HOMEPAGE = "https://github.com/npm/hosted-git-info"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a01f10cd299d5727263720d47cc2c908"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/hosted-git-info/-/hosted-git-info-3.0.8.tgz"
SRC_URI[md5sum] = "a9b30a4488c65794608063ade4a27877"
SRC_URI[sha256sum] = "4c27ea89fcc86c94296bb488759e526cfc821edfd3026421ce33afd5f7b50c36"

NPM_PKGNAME = "hosted-git-info"

inherit npmhelper
inherit native
