SUMMARY = "NPM: reflect-metadata"
DESCRIPTION = "Polyfill for Metadata Reflection API"
HOMEPAGE = "http://rbuckton.github.io/reflect-metadata"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=28f81e70113a2a2bd0fc671463a263b1"

SRC_URI = "https://registry.npmjs.org/reflect-metadata/-/reflect-metadata-0.1.13.tgz"
SRC_URI[md5sum] = "3f5d03db9123aa9c68bb5a643903f11c"
SRC_URI[sha256sum] = "7fe22a26454b2df207192e80a53946fba053723d653a71b9fa35cb13bfc0842d"

NPM_PKGNAME = "reflect-metadata"

inherit npmhelper
inherit native
