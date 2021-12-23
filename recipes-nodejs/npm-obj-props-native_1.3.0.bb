SUMMARY = "NPM: obj-props"
DESCRIPTION = "List of properties for JavaScript objects"
HOMEPAGE = "https://github.com/dustinspecker/obj-props#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d8beadf9a6499a20c088624cd844e547"

SRC_URI = "https://registry.npmjs.org/obj-props/-/obj-props-1.3.0.tgz"
SRC_URI[md5sum] = "ab45790d12ef25b271e0705f15cbdc4e"
SRC_URI[sha256sum] = "ca7dad5516740c0db50ebeec237f934b90afcdc2cab6f4faae7774c08c2ca14e"

NPM_PKGNAME = "obj-props"

inherit npmhelper
inherit native
