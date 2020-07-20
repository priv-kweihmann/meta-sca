SUMMARY = "NPM: hosted-git-info"
DESCRIPTION = "Provides metadata and conversions from repository urls for Github, Bitbucket and Gitlab"
HOMEPAGE = "https://github.com/npm/hosted-git-info"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a01f10cd299d5727263720d47cc2c908"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/hosted-git-info/-/hosted-git-info-3.0.5.tgz"
SRC_URI[md5sum] = "c2947522d78bbc14311f7a650f0c43d6"
SRC_URI[sha256sum] = "fc220ebb22aa39711fc0175884f477909f0feddf14616ca7adb0e1547755e8ce"

NPM_PKGNAME = "hosted-git-info"

inherit npmhelper
inherit native
