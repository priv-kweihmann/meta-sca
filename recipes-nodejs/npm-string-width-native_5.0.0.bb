SUMMARY = "NPM: string-width"
DESCRIPTION = "Get the visual width of a string - the number of columns required to display it"
HOMEPAGE = "https://github.com/sindresorhus/string-width#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-emoji-regex-native \
           npm-is-fullwidth-code-point-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/string-width/-/string-width-5.0.0.tgz"
SRC_URI[md5sum] = "4ec0e7eb5557abbd8b0c9b4e05359e8e"
SRC_URI[sha256sum] = "896eee6ef2640e4f34c2b19f93adab63244d16cd154f5ab0efcf80d172ef5535"

NPM_PKGNAME = "string-width"

inherit npmhelper
inherit native
