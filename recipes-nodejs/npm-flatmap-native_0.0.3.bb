SUMMARY = "NPM: flatmap"
DESCRIPTION = "The missing flatMap function for Node"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=46;md5=ab67dfad20bc465b42f17707146d87e1"

SRC_URI = "https://registry.npmjs.org/flatmap/-/flatmap-0.0.3.tgz"
SRC_URI[md5sum] = "bbda7368652564fe5fde1214fe926fd6"
SRC_URI[sha256sum] = "bbb95a9be2702a2c4cbb55a635cb2a76f8c0f7599f4bfd26178c20ee5e326ff6"

NPM_PKGNAME = "flatmap"

inherit npmhelper
inherit native
