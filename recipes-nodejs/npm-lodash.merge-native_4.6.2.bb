SUMMARY = "NPM: lodash.merge"
DESCRIPTION = "The Lodash method `_.merge` exported as a module."
HOMEPAGE = "https://lodash.com/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8e2fca844c70b3833d7228885447c026"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lodash.merge/-/lodash.merge-4.6.2.tgz"
SRC_URI[md5sum] = "b166e61708e7304ca2643800ec4c1914"
SRC_URI[sha256sum] = "a34e27a950d64a15ee31c652ff1f29c29b42eadaace1d203c680ca314959ef96"

NPM_PKGNAME = "lodash.merge"

inherit npmhelper
inherit native
