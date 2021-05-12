SUMMARY = "NPM: object-inspect"
DESCRIPTION = "string representations of objects in node and the browser"
HOMEPAGE = "https://github.com/inspect-js/object-inspect"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/object-inspect/-/object-inspect-1.10.3.tgz"
SRC_URI[md5sum] = "35d29145fbf0f64e6abb356b62ed37ba"
SRC_URI[sha256sum] = "d1d29dffb621bb8022ccfdccc1f0f43b3760915d05b5dd6278f2e11a045378b9"

NPM_PKGNAME = "object-inspect"

inherit npmhelper
inherit native
