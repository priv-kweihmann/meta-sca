SUMMARY = "NPM: normalize-url"
DESCRIPTION = "Normalize a URL"
HOMEPAGE = "https://github.com/sindresorhus/normalize-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-url/-/normalize-url-7.0.2.tgz"
SRC_URI[md5sum] = "0503cb3cf7ec2615df509790491e8251"
SRC_URI[sha256sum] = "d3e9cc153560555658319550e997c24bbc180d226f2d00ec4bc464e80bd70eef"

NPM_PKGNAME = "normalize-url"

inherit npmhelper
inherit native
