SUMMARY = "NPM: functional-red-black-tree"
DESCRIPTION = "A fully persistent balanced binary search tree"
HOMEPAGE = "https://github.com/mikolalysenko/functional-red-black-tree"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34aed54d1454553d81a843e946b173a0"

SRC_URI = "https://registry.npmjs.org/functional-red-black-tree/-/functional-red-black-tree-1.0.1.tgz"
SRC_URI[md5sum] = "27fce83a49fcbb227c8633a18591275f"
SRC_URI[sha256sum] = "d942dfa760778f80a331d3e84b4471e8eaf98a5d43cd0443d6022fa6cf745f0d"

NPM_PKGNAME = "functional-red-black-tree"

inherit npmhelper
inherit native
