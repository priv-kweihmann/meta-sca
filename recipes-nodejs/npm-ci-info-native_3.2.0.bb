SUMMARY = "NPM: ci-info"
DESCRIPTION = "Get details about the current Continuous Integration environment"
HOMEPAGE = "https://github.com/watson/ci-info"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=69386bc3e18d6a71ce25b9aa39ecf076"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ci-info/-/ci-info-3.2.0.tgz"
SRC_URI[md5sum] = "270d752f486afca976b33ea7443fab8d"
SRC_URI[sha256sum] = "bf64b556f364e06d1bf208c884ea5faa5fd13e69a6b3058a8c7be8cf913f2d8f"

NPM_PKGNAME = "ci-info"

inherit npmhelper
inherit native
