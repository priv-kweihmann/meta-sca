SUMMARY = "NPM: string-width"
DESCRIPTION = "Get the visual width of a string - the number of columns required to display it"
HOMEPAGE = "https://github.com/sindresorhus/string-width#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-emoji-regex-native \
           npm-is-fullwidth-code-point-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/string-width/-/string-width-5.0.1.tgz"
SRC_URI[md5sum] = "00175ee926aa36c302e69277e59c3eee"
SRC_URI[sha256sum] = "6f90315f4709d77211613e5efb6dd8e94afb94150f3516742329c2dbf7cc4178"

NPM_PKGNAME = "string-width"

inherit npmhelper
inherit native
