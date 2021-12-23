SUMMARY = "NPM: imurmurhash"
DESCRIPTION = "An incremental implementation of MurmurHash3"
HOMEPAGE = "https://github.com/jensyt/imurmurhash-js"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=105;md5=e4bf10d8a74c91aa9ea3c3cb07fd1d97"

SRC_URI = "https://registry.npmjs.org/imurmurhash/-/imurmurhash-0.1.4.tgz"
SRC_URI[md5sum] = "54bf7101d59d33d9b13d6a91a72bc9b7"
SRC_URI[sha256sum] = "ac23a031966a7371d192e35c7852ab31c772b7d4e468ddd886ad3c014372cb60"

S = "${WORKDIR}/package"

NPM_PKGNAME = "imurmurhash"

inherit npmhelper
inherit native
