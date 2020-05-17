SUMMARY = "NPM: hosted-git-info"
DESCRIPTION = "Provides metadata and conversions from repository urls for Github, Bitbucket and Gitlab"
HOMEPAGE = "https://github.com/npm/hosted-git-info"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a01f10cd299d5727263720d47cc2c908"

SRC_URI = "https://registry.npmjs.org/hosted-git-info/-/hosted-git-info-2.8.8.tgz"
SRC_URI[md5sum] = "89193763dc4eedef0b810f44f3b3fc18"
SRC_URI[sha256sum] = "bff4cd9a675d3d2cb98c016eceffa2af4374d903c62f379f6071feed933fb704"

NPM_PKGNAME = "hosted-git-info"

inherit npmhelper
inherit native
