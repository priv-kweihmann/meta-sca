SUMMARY = "NPM: slice-ansi"
DESCRIPTION = "Slice a string with ANSI escape codes"
HOMEPAGE = "https://github.com/chalk/slice-ansi#readme"

DEPENDS = "npm-ansi-styles-native npm-astral-regex-native npm-is-fullwidth-code-point-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=515648822c4ac919c075fb9c8cc000b6"

SRC_URI = "https://registry.npmjs.org/slice-ansi/-/slice-ansi-2.1.0.tgz"
SRC_URI[md5sum] = "7b4920c7268ad2dedd019908729719b5"
SRC_URI[sha256sum] = "44144ec2302bffdee1331ec593022c9851e5682c6777da0717e368ef01947b08"

NPM_PKGNAME = "slice-ansi"

inherit npmhelper
inherit native
