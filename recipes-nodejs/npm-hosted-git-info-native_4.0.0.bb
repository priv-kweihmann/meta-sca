SUMMARY = "NPM: hosted-git-info"
DESCRIPTION = "Provides metadata and conversions from repository urls for GitHub, Bitbucket and GitLab"
HOMEPAGE = "https://github.com/npm/hosted-git-info"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a01f10cd299d5727263720d47cc2c908"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/hosted-git-info/-/hosted-git-info-4.0.0.tgz"
SRC_URI[md5sum] = "02d23eae8102351071d00a668aea9892"
SRC_URI[sha256sum] = "637a797842b13809fb4472ea0f90e9b0f17da28d4b5143378d88fcc1daf63e43"

NPM_PKGNAME = "hosted-git-info"

inherit npmhelper
inherit native
