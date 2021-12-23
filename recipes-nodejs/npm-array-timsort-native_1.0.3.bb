SUMMARY = "NPM: array-timsort"
DESCRIPTION = "Fast JavaScript array sorting by implementing Python's Timsort algorithm"
HOMEPAGE = "https://github.com/kaelzhang/node-array-timsort"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1a4424c73be0822c92e2c175d58f1d23"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/array-timsort/-/array-timsort-1.0.3.tgz"
SRC_URI[md5sum] = "013a6b7ee33915ad747a3f53d8fec370"
SRC_URI[sha256sum] = "b65b20f709e029efad2d5a7d8bf5880af1fb9f99e7991aadafb8c9b3d1802b2c"

NPM_PKGNAME = "array-timsort"

inherit npmhelper
inherit native
