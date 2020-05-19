SUMMARY = "NPM: tough-cookie"
DESCRIPTION = "RFC6265 Cookies and Cookie Jar for node.js"
HOMEPAGE = "https://github.com/salesforce/tough-cookie"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7189377a5215f1211b70cf2b9754841e"

DEPENDS = "npm-psl-native \
           npm-punycode-native \
           npm-universalify-native"

SRC_URI = "https://registry.npmjs.org/tough-cookie/-/tough-cookie-4.0.0.tgz"
SRC_URI[md5sum] = "31832ce99591e83eafde8e61db094df2"
SRC_URI[sha256sum] = "7f9d13e50adf0538d8e53be22c7bc5520c5a85512802d63f748bc5adf8b32d9d"

NPM_PKGNAME = "tough-cookie"

inherit npmhelper
inherit native
