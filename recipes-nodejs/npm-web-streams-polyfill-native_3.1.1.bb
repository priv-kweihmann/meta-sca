SUMMARY = "NPM: web-streams-polyfill"
DESCRIPTION = "Web Streams, based on the WHATWG spec reference implementation"
HOMEPAGE = "https://github.com/MattiasBuelens/web-streams-polyfill#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f386ec07283033a802d3be56cae4a3c8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/web-streams-polyfill/-/web-streams-polyfill-3.1.1.tgz"
SRC_URI[md5sum] = "83e7eb760f1a16909ec85784228fa67a"
SRC_URI[sha256sum] = "7f2f66a70c41f9d1c8638014b2a01adeaa498c344759eb35fb2ea7d53e0e94cd"

NPM_PKGNAME = "web-streams-polyfill"

inherit npmhelper
inherit native
