SUMMARY = "NPM: hosted-git-info"
DESCRIPTION = "Provides metadata and conversions from repository urls for GitHub, Bitbucket and GitLab"
HOMEPAGE = "https://github.com/npm/hosted-git-info"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a01f10cd299d5727263720d47cc2c908"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/hosted-git-info/-/hosted-git-info-5.0.0.tgz"
SRC_URI[md5sum] = "a0f8330d9eaa9b6ff5d5fc3055a402cb"
SRC_URI[sha256sum] = "88e7c19a33ada1efd7c78c4f642456c217a42e1febaba071a7b8094f822e96de"

NPM_PKGNAME = "hosted-git-info"

inherit npmhelper
inherit native
