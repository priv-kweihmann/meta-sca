SUMMARY = "NPM: cssesc"
DESCRIPTION = "A JavaScript library for escaping CSS strings and identifiers while generating the shortest possible ASCII-only output."
HOMEPAGE = "https://mths.be/cssesc"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

SRC_URI = "https://registry.npmjs.org/cssesc/-/cssesc-3.0.0.tgz"
SRC_URI[md5sum] = "99db49f42a59f95e9446df17348c0b73"
SRC_URI[sha256sum] = "31a59523b764560845e79191632d9967d6f83514cc4c97394b0810287c101743"

NPM_PKGNAME = "cssesc"

inherit npmhelper
inherit native
