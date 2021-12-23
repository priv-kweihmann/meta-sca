SUMMARY = "NPM: through"
DESCRIPTION = "simplified stream construction"
HOMEPAGE = "https://github.com/dominictarr/through"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1"

SRC_URI = "https://registry.npmjs.org/through/-/through-2.3.8.tgz"
SRC_URI[md5sum] = "615296782d4936bd53ebe4e5baa57db7"
SRC_URI[sha256sum] = "16b27a8c0fb13e5727356b328d72dbbc5f20bd909252f14d19da344e9354573e"

NPM_PKGNAME = "through"

inherit npmhelper
inherit native
