SUMMARY = "NPM: crypt"
DESCRIPTION = "utilities for encryption and hashing"
HOMEPAGE = "https://github.com/pvorb/node-crypt#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.mkd;md5=b8024dcec94c3e11ece8465dd3c94c2a"

SRC_URI = "https://registry.npmjs.org/crypt/-/crypt-0.0.2.tgz"
SRC_URI[md5sum] = "d97301b0e3a597e8103b75007d6ebf1d"
SRC_URI[sha256sum] = "011d343351e9ac1de36a622a3e678f0f393f188f1cffb5988b7387834a519099"

NPM_PKGNAME = "crypt"

inherit npmhelper
inherit native
