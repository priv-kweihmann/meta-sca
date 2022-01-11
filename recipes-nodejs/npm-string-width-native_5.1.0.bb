SUMMARY = "NPM: string-width"
DESCRIPTION = "Get the visual width of a string - the number of columns required to display it"
HOMEPAGE = "https://github.com/sindresorhus/string-width#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-eastasianwidth-native \
           npm-emoji-regex-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/string-width/-/string-width-5.1.0.tgz"
SRC_URI[md5sum] = "c98139d51205bcca88dd8174510c0dc4"
SRC_URI[sha256sum] = "c66585e44d04958475230c91c6cf09dbe4438caef7e39767bf64f9956b3670a6"

NPM_PKGNAME = "string-width"

inherit npmhelper
inherit native
