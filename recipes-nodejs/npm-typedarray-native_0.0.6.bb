SUMMARY = "NPM: typedarray"
DESCRIPTION = "TypedArray polyfill for old browsers"
HOMEPAGE = "https://github.com/substack/typedarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6085b70b74c7dcf7df4e955725e3153d"

SRC_URI = "https://registry.npmjs.org/typedarray/-/typedarray-0.0.6.tgz"
SRC_URI[md5sum] = "54a18bcd7fd55c812993e9ce90a0709d"
SRC_URI[sha256sum] = "3f324b75a9581c4c85cec25e8cd30831ccaa3c87770cee2ff4b9167055004108"

NPM_PKGNAME = "typedarray"

inherit npmhelper
inherit native
