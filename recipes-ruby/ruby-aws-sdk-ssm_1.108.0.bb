SUMMARY = "RubyGem: aws-sdk-ssm"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Systems Manager (SSM) (Amazon SSM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "57b8d317c7e4116f1d1969ebb96c238a"
SRC_URI[sha256sum] = "99f5fba1609b1e3a85362319da420fcdb8e080c64dacbc1e46002fcaa01e33b8"

GEM_NAME = "aws-sdk-ssm"

inherit rubygems
