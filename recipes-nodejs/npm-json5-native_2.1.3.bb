SUMMARY = "NPM: json5"
DESCRIPTION = "JSON for humans."
HOMEPAGE = "http://json5.org/"

DEPENDS = "npm-minimist-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=d80f2808a405d641840b50a06f80e93c"

SRC_URI = "https://registry.npmjs.org/json5/-/json5-2.1.3.tgz"
SRC_URI[md5sum] = "d2ffde60653ae3824acf00ccae277260"
SRC_URI[sha256sum] = "d7ea59ee0c9b4bc700c12cb281515221fdf0881c3a7a9e968e6f3150a51d3f9e"

NPM_PKGNAME = "json5"

inherit npmhelper
inherit native
