SUMMARY = "NPM: totalist"
DESCRIPTION = "A tiny (195B to 220B) utility to recursively list all (total) files in a directory"
HOMEPAGE = "https://github.com/lukeed/totalist#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/totalist/-/totalist-2.0.0.tgz"
SRC_URI[md5sum] = "283538dfa1e5099d85e869694059eb1d"
SRC_URI[sha256sum] = "48ad4e59a737d18eca3c3d522ff0760ec07e3cc0fa973fdc9b0de17172300162"

NPM_PKGNAME = "totalist"

inherit npmhelper
inherit native
