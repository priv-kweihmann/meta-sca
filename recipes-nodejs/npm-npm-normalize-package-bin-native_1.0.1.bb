SUMMARY = "NPM: npm-normalize-package-bin"
DESCRIPTION = "Turn any flavor of allowable package.json bin into a normalized object"
HOMEPAGE = "https://github.com/npm/npm-normalize-package-bin#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=89966567781ee3dc29aeca2d18a59501"

SRC_URI = "https://registry.npmjs.org/npm-normalize-package-bin/-/npm-normalize-package-bin-1.0.1.tgz"
SRC_URI[md5sum] = "3db4c33c8a0987a2957bfd0869178f47"
SRC_URI[sha256sum] = "b0de3cbf07abd1be4892da4829a95c2f6335ed648ebdb2a33e152287346612bd"

NPM_PKGNAME = "npm-normalize-package-bin"

inherit npmhelper
inherit native
