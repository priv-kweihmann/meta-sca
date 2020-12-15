SUMMARY = "RubyGem: aws-sdk-organizations"
DESCRIPTION = "Official AWS Ruby gem for AWS Organizations (Organizations)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://lib/aws-sdk-organizations/client.rb;beginline=734;endline=996;md5=3c5a76815a0a6b63c8fe4e5aa9117953"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d21a97e6a9a9f015c3821310fde676e9"
SRC_URI[sha256sum] = "e7d604fd379bc69595a3edeed2dc145f43f020a8dbfe6b5e80acedd0d99a2802"

GEM_NAME = "aws-sdk-organizations"

inherit rubygems
