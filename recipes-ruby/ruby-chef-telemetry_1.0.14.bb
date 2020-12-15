SUMMARY = "RubyGem: chef-telemetry"
DESCRIPTION = "Send user actions to the Chef telemetry system"
HOMEPAGE = "https://github.com/chef/chef-telemetry"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-chef-config \
                  ruby-concurrent-ruby \
                  ruby-ffi-yajl"

SRC_URI[md5sum] = "4edd0f5999c2118399ef72c952303c7b"
SRC_URI[sha256sum] = "a5e654866728ddf1309a1c9cc6728e24e86ab736d230f6dbb74bbfb94dc6d542"

GEM_NAME = "chef-telemetry"

inherit rubygems
