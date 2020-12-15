SUMMARY = "RubyGem: multi_json"
DESCRIPTION = "A common interface to multiple JSON libraries, including Oj, Yajl, the JSON gem (with C-extensions), the pure-Ruby JSON gem, NSJSONSerialization, gson.rb, JrJackson, and OkJson."
HOMEPAGE = "https://github.com/intridea/multi_json"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=77e7a5e1b7c128037628b4bc5324c64a"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "06f0ae43e84ec7b9357f4095f8417cd5"
SRC_URI[sha256sum] = "1fd04138b6e4a90017e8d1b804c039031399866ff3fbabb7822aea367c78615d"

GEM_NAME = "multi_json"

inherit rubygems
