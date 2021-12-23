SUMMARY = "NPM: has-flag"
DESCRIPTION = "Check if argv has a specific flag"
HOMEPAGE = "https://github.com/sindresorhus/has-flag#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/has-flag/-/has-flag-5.0.1.tgz"
SRC_URI[md5sum] = "c29184318f9e62e66e21354bff479d3d"
SRC_URI[sha256sum] = "b1b9152724e4946f3ee7202ef5c316825ffc498384cb5870dc021d141c7d916b"

NPM_PKGNAME = "has-flag"

inherit npmhelper
inherit native
