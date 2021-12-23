SUMMARY = "NPM: get-stream"
DESCRIPTION = "Get a stream as a string, buffer, or array"
HOMEPAGE = "https://github.com/sindresorhus/get-stream#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/get-stream/-/get-stream-6.0.1.tgz"
SRC_URI[md5sum] = "da501182e63ced649fcdffb8224700a5"
SRC_URI[sha256sum] = "932b374872f6626198963d6fba7f93164bd6b4f12aad4ebcd16b49717be51622"

NPM_PKGNAME = "get-stream"

inherit npmhelper
inherit native
