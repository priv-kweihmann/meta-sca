SUMMARY = "NPM: istextorbinary"
DESCRIPTION = "Determine if a filename and/or buffer is text or binary. Smarter detection than the other solutions."
HOMEPAGE = "https://github.com/bevry/istextorbinary"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0fd8645059211e9fe4737701ca81bb98"

DEPENDS = "npm-binaryextensions-native \
           npm-textextensions-native"

SRC_URI = "https://registry.npmjs.org/istextorbinary/-/istextorbinary-5.15.0.tgz"
SRC_URI[md5sum] = "79803c0c7ecf3527e59978ef4486bfc0"
SRC_URI[sha256sum] = "48219013ab8405a1c19d83bd1bb69850ce1fd51cd821aa7e55378c9f68fc21c0"

NPM_PKGNAME = "istextorbinary"

inherit npmhelper
inherit native
