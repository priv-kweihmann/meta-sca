SUMMARY = "RubyGem: inspec-core"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38becae1e765aa7075044208bbab2ea4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-addressable \
                  ruby-chef-telemetry \
                  ruby-faraday \
                  ruby-hashie \
                  ruby-license-acceptance \
                  ruby-method-source \
                  ruby-mixlib-log \
                  ruby-multipart-post \
                  ruby-parallel \
                  ruby-parslet \
                  ruby-pry \
                  ruby-rspec \
                  ruby-rspec-its \
                  ruby-rubyzip \
                  ruby-semverse \
                  ruby-sslshake \
                  ruby-thor \
                  ruby-tomlrb \
                  ruby-train-core \
                  ruby-tty-prompt \
                  ruby-tty-table"

SRC_URI[md5sum] = "772d5885af42f399378685a3e6b182a7"
SRC_URI[sha256sum] = "e706bac551519a38182b73b2a9aeffabc3eab5acb5b5c7a1b70f60331a0499bd"

GEM_NAME = "inspec-core"

inherit rubygems
