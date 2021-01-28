SUMMARY = "RubyGem: inspec"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://lib/plugins/inspec-init/templates/profiles/gcp/inspec.yml;beginline=6;endline=6;md5=cfb5ff7823bc166fac8853e293b76fd7"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-faraday-middleware \
                  ruby-inspec-core \
                  ruby-train \
                  ruby-train-aws \
                  ruby-train-habitat \
                  ruby-train-winrm"

SRC_URI[md5sum] = "478fed31012bb0a89d48c941a5989244"
SRC_URI[sha256sum] = "75242d6fd95c9ad68f177d6469c7510d9c85b69deb4f164e82ff6f53320ae849"

GEM_NAME = "inspec"

inherit rubygems
