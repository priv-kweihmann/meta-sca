SUMMARY = "NPM: regex-not"
DESCRIPTION = "Create a javascript regular expression for matching everything except for the given string."
HOMEPAGE = "https://github.com/jonschlinkert/regex-not"

DEPENDS = "npm-extend-shallow-native npm-safe-regex-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c5e341361a86b6253a8e81978cbb67e"

SRC_URI = "https://registry.npmjs.org/regex-not/-/regex-not-1.0.2.tgz"
SRC_URI[md5sum] = "e54f51e5d23c17edae9f9d199b337531"
SRC_URI[sha256sum] = "fa4448bb964e8f97905f8e557d529884f08dea1a5e61e88d7589819967bef276"

NPM_PKGNAME = "regex-not"

inherit npmhelper
inherit native
