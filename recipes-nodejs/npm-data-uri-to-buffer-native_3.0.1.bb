SUMMARY = "NPM: data-uri-to-buffer"
DESCRIPTION = "Generate a Buffer instance from a Data URI string"
HOMEPAGE = "https://github.com/TooTallNate/node-data-uri-to-buffer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=65;md5=a448c2725100d39d73e324e98955397d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/data-uri-to-buffer/-/data-uri-to-buffer-3.0.1.tgz"
SRC_URI[md5sum] = "58ab9f3902c7a545a9e7f815bdec9ad6"
SRC_URI[sha256sum] = "3787e95764b16659c50f96ab4889f9a354ba3c273620b1f0aea3fdad9fbd4dcc"

NPM_PKGNAME = "data-uri-to-buffer"

inherit npmhelper
inherit native
