SUMMARY = "NPM: hosted-git-info"
DESCRIPTION = "Provides metadata and conversions from repository urls for GitHub, Bitbucket and GitLab"
HOMEPAGE = "https://github.com/npm/hosted-git-info"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a01f10cd299d5727263720d47cc2c908"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/hosted-git-info/-/hosted-git-info-4.1.0.tgz"
SRC_URI[md5sum] = "2f9810b0bdbadbd9509eb389ff353417"
SRC_URI[sha256sum] = "b8fff4cbcf8a1f9abecbe1ccf717e6018cdd4123e2d5a1705db77c9b14ae5fde"

NPM_PKGNAME = "hosted-git-info"

inherit npmhelper
inherit native
