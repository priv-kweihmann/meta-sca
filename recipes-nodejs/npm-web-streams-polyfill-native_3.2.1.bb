SUMMARY = "NPM: web-streams-polyfill"
DESCRIPTION = "Web Streams, based on the WHATWG spec reference implementation"
HOMEPAGE = "https://github.com/MattiasBuelens/web-streams-polyfill#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f386ec07283033a802d3be56cae4a3c8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/web-streams-polyfill/-/web-streams-polyfill-3.2.1.tgz"
SRC_URI[md5sum] = "0c52078d56dd607f48554b6264be4324"
SRC_URI[sha256sum] = "466e2cfb521b88fd04e27c54c9985d87c9e5659152e1fa150194d4a26a13e66f"

NPM_PKGNAME = "web-streams-polyfill"

inherit npmhelper
inherit native
