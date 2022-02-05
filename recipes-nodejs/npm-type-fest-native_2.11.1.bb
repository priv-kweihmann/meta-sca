SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=3e06173a93caec684ac1dbab40aec199"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.11.1.tgz"
SRC_URI[md5sum] = "c5b3eea7aabaafc35838f6b8f1ddf4ec"
SRC_URI[sha256sum] = "485ec470bc7314e41a65607b510a14ee11ba3cff9f97c445f74d9d11d92d8541"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
