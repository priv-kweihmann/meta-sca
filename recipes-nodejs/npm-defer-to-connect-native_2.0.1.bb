SUMMARY = "NPM: defer-to-connect"
DESCRIPTION = "The safe way to handle the `connect` socket event"
HOMEPAGE = "https://github.com/szmarczak/defer-to-connect#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/defer-to-connect/-/defer-to-connect-2.0.1.tgz"
SRC_URI[md5sum] = "befded01d6d3f35dd7011f296f938114"
SRC_URI[sha256sum] = "c35b074db709c97aa10b9b4bc34f43ec96d517a3fac29b11cdf5f00e899ad432"

NPM_PKGNAME = "defer-to-connect"

inherit npmhelper
inherit native
