SUMMARY = "NPM: hosted-git-info"
DESCRIPTION = "Provides metadata and conversions from repository urls for Github, Bitbucket and Gitlab"
HOMEPAGE = "https://github.com/npm/hosted-git-info"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a01f10cd299d5727263720d47cc2c908"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/hosted-git-info/-/hosted-git-info-3.0.4.tgz"
SRC_URI[md5sum] = "264cf919afbd922606b064cc14d44e2f"
SRC_URI[sha256sum] = "76cbbed99d8be14da5d35e3d5e36901c22b703d026aa67beabb8fa3568fd5a20"

NPM_PKGNAME = "hosted-git-info"

inherit npmhelper
inherit native
