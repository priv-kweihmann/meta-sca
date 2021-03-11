SUMMARY = "RubyGem: aws-sdk-route53resolver"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 Resolver (Route53Resolver)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "ab0a74417b93cadf5a6a5ecd4986c1b9"
SRC_URI[sha256sum] = "860ecef66d3b6c3ff2b59b1c8800f9103c47a7fa13b963b4dfc32edee05ac678"

GEM_NAME = "aws-sdk-route53resolver"

inherit rubygems
