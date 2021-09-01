SUMMARY = "NPM: web-streams-polyfill"
DESCRIPTION = "Web Streams, based on the WHATWG spec reference implementation"
HOMEPAGE = "https://github.com/MattiasBuelens/web-streams-polyfill#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f386ec07283033a802d3be56cae4a3c8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/web-streams-polyfill/-/web-streams-polyfill-3.1.0.tgz"
SRC_URI[md5sum] = "0bf35750cdf2c82f8b985f298dff1af8"
SRC_URI[sha256sum] = "b729e864ea5829814f20fc790ea28369af683ff0207d739c5ffe0e051bfe0d80"

NPM_PKGNAME = "web-streams-polyfill"

inherit npmhelper
inherit native
