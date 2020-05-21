SUMMARY = "NPM: strip-filename-increment"
DESCRIPTION = "Operating systems commonly add a trailing increment, or the word 'copy', or something similar to duplicate files. This strips those increments. Tested on Windows, MacOS, and Linux."
HOMEPAGE = "https://github.com/jonschlinkert/strip-filename-increment"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cb53134bd0eae85b900bf3ea8eb53277"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/strip-filename-increment/-/strip-filename-increment-2.0.1.tgz"
SRC_URI[md5sum] = "a6a05da8ee6dac4d540a1ed1c3c1105e"
SRC_URI[sha256sum] = "340c75d3508e55f57c09dd1acc688697783153b419d0d9dc948592c7680eb121"

NPM_PKGNAME = "strip-filename-increment"

inherit npmhelper
inherit native
