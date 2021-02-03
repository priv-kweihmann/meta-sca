SUMMARY = "RubyGem: aws-sdk-batch"
DESCRIPTION = "Official AWS Ruby gem for AWS Batch"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "630117727399fe065828cfb907c66fbf"
SRC_URI[sha256sum] = "b14a951b7fabf75da5f25243bc03192d0565e79e403041cba4847580fba6a532"

GEM_NAME = "aws-sdk-batch"

inherit rubygems
