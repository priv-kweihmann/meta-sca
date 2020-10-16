SUMMARY = "NPM: hosted-git-info"
DESCRIPTION = "Provides metadata and conversions from repository urls for Github, Bitbucket and Gitlab"
HOMEPAGE = "https://github.com/npm/hosted-git-info"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a01f10cd299d5727263720d47cc2c908"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/hosted-git-info/-/hosted-git-info-3.0.7.tgz"
SRC_URI[md5sum] = "a92e3842821eb2d230ced65e96f9c9e0"
SRC_URI[sha256sum] = "32ed89a9e67093c84f0e209e97141be96e3a2a8782999d33b65a82fdc5918d40"

NPM_PKGNAME = "hosted-git-info"

inherit npmhelper
inherit native
