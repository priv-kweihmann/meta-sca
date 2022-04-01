SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=3e06173a93caec684ac1dbab40aec199"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.12.2.tgz"
SRC_URI[md5sum] = "e8b71b53020c07e14802c1be55d815db"
SRC_URI[sha256sum] = "d445ed34b8eabd1e621b937786d2878a2b84e2268f4a9223f46536ee2baf175f"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
