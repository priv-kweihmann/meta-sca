SUMMARY = "NPM: hosted-git-info"
DESCRIPTION = "Provides metadata and conversions from repository urls for Github, Bitbucket and Gitlab"
HOMEPAGE = "https://github.com/npm/hosted-git-info"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a01f10cd299d5727263720d47cc2c908"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/hosted-git-info/-/hosted-git-info-3.0.6.tgz"
SRC_URI[md5sum] = "5b68b6e22d41c7f375656aaa9fd80abf"
SRC_URI[sha256sum] = "7d8cfa946ccfbb18a3f86843e4f692bc619eb7a7f4fc73cb6af4b4c2d1744075"

NPM_PKGNAME = "hosted-git-info"

inherit npmhelper
inherit native
